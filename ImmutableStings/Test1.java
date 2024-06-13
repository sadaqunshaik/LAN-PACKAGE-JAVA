
class Immute_str{
    public static void main(String[] args) {
        
        String s1="Rahul";
        String s2=new String("Rahul");
        String s3="Rahul";
        String s4=new String("Rahul");

        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s2==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s1.equals(s4));//true
        System.out.println(s2.equals(s4));//true
        System.out.println(s2==s4);////false

    }

}

