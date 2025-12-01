package GenericClass;

public class Solution<T> {
    public T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.setName("ketan");
        Solution s1=new Solution();
        s1.setName(1);
        System.out.println(s.getName());
        System.out.println(s1.getName());


    }
}
