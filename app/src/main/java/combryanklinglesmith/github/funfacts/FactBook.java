package combryanklinglesmith.github.funfacts;

import java.util.Random;

class FactBook {
    // Fields or Member Variables - Properties about the object
    private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not actually in a tree.",
            "Kasie is a very cool person lol.",
            "Aunt Nancy said Kasie is fake news",
            "Lindsey said hit or miss. I guess they never miss huh",
            "In 1642 Dutch explorer Abel Tasman sailed all the way around Australia and never saw it.",
            "Amelia Airhart was the first person to fly solo from Hawaii to the United States.",
            "Cap’n Crunch’s full name is Horatio Magellan Crunch.",
            ""};

    // Methods - Actions the object can take
    String getFact() {

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
