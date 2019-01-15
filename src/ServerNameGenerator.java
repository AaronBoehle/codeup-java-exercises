public class ServerNameGenerator {

     static String[] adjectives = {
            "cunning",
            "pompous",
            "vulgar",
            "cynical",
            "belligerent",
            "tactless",
            "sullen",
            "finicky",
            "obnoxious",
            "intolerant"
    };
    static String[] nouns = {
            "gangster",
            "hero",
            "ninja",
            "priest",
            "politician",
            "chef",
            "mudblood",
            "squib",
            "parrot",
            "professor",


    };

    public static int randomIndex (String[] array) {
        double max = array.length-1;
        double min = 0;
        double surprise = Math.ceil(Math.random() * ((max - min) + min));
        return (int) surprise;
    }
    public static void main(String[] args) {
        String randomAdjective = adjectives[randomIndex(adjectives)];
        String randomNoun = nouns[randomIndex(nouns)];
        System.out.printf("You're such a %s-%s", randomAdjective, randomNoun);

    }
}
