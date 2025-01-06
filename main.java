class student{
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
}
class main{
    public static void main(String [] args){
        student s=new student();
        s.setname("priyank");
        System.out.println(s.getname());
    }
}