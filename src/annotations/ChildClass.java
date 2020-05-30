package annotations;

public class ChildClass extends ParentClass {
    public void doChildStuff(){
        System.out.println("Acting like a child");
    }

    @Override
    public void doParentThings() {
        super.doParentThings();
        System.out.println("Also doing some child stuff...");
    }
}
