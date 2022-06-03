public class Account {
    String name;
    int age;

    public static void main (String [] args) {

        Account a = new Account();

        a.setName("Pablo");
        a.setAge (34);
        System.out.println (a.getName());
        System.out.println (a.getAge());


    }
    public void setName (String name) {
        //String name = JOptionPane.showInputDialog ("Insert name");
        this.name = name;
    }
    public void setAge (int age) {
        //int age = Integer.parseInt (JOptionPane.showInputDialog ("Insert name"));
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public Integer getAge () {
        return this.age;
    }
}
