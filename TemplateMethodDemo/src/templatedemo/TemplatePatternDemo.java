package templatedemo;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        //if (game instanceof Cricket)
        //    ((Cricket) game).hallowelt();

        System.out.println();
        game = new Football();
        game.play();

//        try {
//            ((Cricket) game).hallowelt();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Finally");
//        }
    }
}