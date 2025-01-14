class Students {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class GetSet{
    public static void main(String[] args){
        Students s=new Students();
        s.setName("Rainy season");
        System.out.println(s.getName());
    }
}