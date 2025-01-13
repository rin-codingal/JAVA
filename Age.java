class Age {

    int age;
    Age(int h){
        age = h;
    }

    public static void main(String[] args) {
        Age obj = new Age(27);
        System.out.println("obj.age = " + obj.age + " years old");
    }
}