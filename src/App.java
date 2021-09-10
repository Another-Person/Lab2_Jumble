import jdk.internal.org.objectweb.asm.tree.JumpInsnNode;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Jumble test = new Jumble("purple");
        System.out.println(test.getOriginalWord());
        System.out.println(test.getJumbleWord());
    }
}
