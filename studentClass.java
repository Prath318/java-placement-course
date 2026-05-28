public class studentClass {


    public static class student{
        String name;
        int rno;
        double persentage;
    }
    public static void main(String[] args) {

        student x = new student();
        x.name="parth";
        x.rno=45;
        x.persentage=87.5;

        student y = new student();
        y.name="parth"; 
        y.rno=46;
        y.persentage=90.5;


        System.out.println(x.name + " " + x.rno + " " + x.persentage);
    }

    
}
