class FreshJuice{
    /*Data type enum*/
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE};
    FreshJuiceSize size;
}

class FreshJuiceTest {

    public static void main(String args[])
    {
        FreshJuice juice  = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size:\t"+juice.size);
    }
}