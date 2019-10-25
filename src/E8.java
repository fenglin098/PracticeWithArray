public class E8 {
    public static void main(String[] args){
        String[] stringHello=new String[]{"w","t","y","h","k"};
        for (int i=0; i<5; i++){
            if (stringHello[i].equalsIgnoreCase("t")){
                stringHello[i]="hello";
            }System.out.println(stringHello[i]);
        }
    }
}
