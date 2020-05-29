public class Lab11D
{
    public static void main(String[] args)
    {
        VisualArrayList<Picture> list = new VisualArrayList<Picture>();   
        list.add(new Picture("a.jpeg"));
        list.add(new Picture("b.jpeg"));
        list.add(new Picture("c.jpeg"));
        list.add(new Picture("d.jpeg"));
        list.add(new Picture("e.jpeg"));
        list.add(new Picture("f.jpeg"));

        VisualArrayList<Picture> list1 = new VisualArrayList<Picture>();

        for (int i = list.size() / 2; i < list.size(); i++)
        {
            list1.add(list.get(i));
        }

        for (int j = 0; j <= list.size() / 2 - 1; j++)
        {
            list1.add(list.get(j));
        }

        for (int i = 0; i < list.size() / 2; i++)
        {
            list.add(list.remove(0));
        }

        for (int i = 0; i < list.size() / 2; i++)
        {
            Picture temp = list.get(i);
            list.set(i, list.get(i + (list.size() / 2)));
            list.set(i + (list.size() / 2), temp);

        }

    }
}
