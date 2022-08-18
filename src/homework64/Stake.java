package homework64;

public class Stake {
    public static void main(String[] args) {
        String test = "a + (55 - b * [wtf()] / {(3 + 4)}";
        BracketsValidator validator = new BracketsValidator();
        boolean correct = validator.validate(test);
        System.out.println("Brackets plants " + (correct ? "" : "not ") + "true");
        System.out.println(validator.isClosingBracket('}'));
    }
}
