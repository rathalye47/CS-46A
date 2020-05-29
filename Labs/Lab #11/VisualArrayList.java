import java.util.ArrayList;

public class VisualArrayList<E extends Picture> extends ArrayList<E>
{
    private static final int GAP = 10;

    private void visualTranslate(final int dx, final int dy, final Picture p)
    {
        final int x = p.getX();
        final int y = p.getY();

        Thread t = new Thread()
            {
                public void run()
                {
                    final int STEPS = 100;
                    final int DELAY = 10;
                    for (int i = 1; i <= STEPS; i++)
                    {
                        try
                        {
                            p.translate(x + i * dx / STEPS - p.getX(), y + i * dy / STEPS - p.getY());                     
                            Thread.sleep(DELAY);                  
                        }
                        catch (InterruptedException ex) {}
                    }
                }
            };
        t.start();
        try
        {
            t.join();
        }
        catch (InterruptedException ex) {}
    }

    public boolean add(E e) 
    {
        add(size(), e);
        return true;
    }

    public void add(int index, final E element)
    {
        for (int i = size() - 1; i >= index; i--)
        {
            Picture p = get(i);         
            visualTranslate(element.getWidth() + GAP, 0, p);
        }
        super.add(index, element);
        int x = index == 0 ? 0 : get(index - 1).getX() + get(index - 1).getWidth() + GAP;
        element.translate(x - element.getX(), element.getHeight() -element.getY());
        element.draw();
        visualTranslate(0, -element.getHeight(), element);
    }

    public E remove(int index)
    {
        E element = super.remove(index);
        visualTranslate(0, -element.getHeight(), element);
        for (int i = index; i < size(); i++)
        {
            Picture p = get(i);
            visualTranslate(-element.getWidth() - GAP, 0, p);
        }
        return element;
    }

    public E set(int index, E element) 
    {
        E oldElement = get(index);
        super.set(index, null);
        if (!contains(oldElement)) Canvas.getInstance().remove(oldElement);
        int dx = element.getWidth() - oldElement.getWidth();
        for (int i = index + 1; i < size(); i++)
            get(i).translate(dx, 0);
        int x = index == 0 ? 0 : get(index - 1).getX() + get(index - 1).getWidth() + GAP;
        element.translate(x - element.getX(), element.getHeight() -element.getY());
        element.draw();
        visualTranslate(0, -element.getHeight(), element);
        super.set(index, element);
        return oldElement;
    }
}
