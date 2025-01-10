public  class test {
    public static void main(String[] args) {
        int[] arr = new int [5];
        Student std1 = new Student();
        System.err.println(std1.name);
        std1.name="mani";
        std1.id = 47;
        std1.ClassNo = "G2";
        std1.dept  =  "cse";
        System.out.println(std1);
    }
}