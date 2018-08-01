package com.example.sorin.geofun.funfacts;
import java.util.Random;

public class FactBook {

    private String[] funFact={"Africa is the only continent situated in all the four hemispheres – the western, the eastern, the northern and the southern.",
    " Lesotho, The Vatican and San Marino are the only three countries in the world that are surrounded entirely by only one country. Lesotho borders South Africa, The Vatican and San Marino border Italy.",
    "The Greek national anthem consists of 158 verses. It is not known if there is a Greek who can sing them all by heart",
        "There is not a single river in Saudi Arabia",
        "The shortest place name in the world is Å. Villages with this name can be found both in Norway and Sweden. In the Scandinavian languages “Å” means “River”",
        "The smallest country area is that of the Vatican (2 square miles/5 square kilometers), while the largest city area is that of Hulunbuir in China (101,912 square miles/263,953 square kilometers)",
        " New York drifts away from London 1 inch/2,5 cm every year.",
           " Dust from Africa can reach as far as Florida." ,
        "The Himalayas are getting higher 0,6 inch/1,5 cm every year.",
        " There is a heart-shaped coral reef in Australia.",
        "Cuba is the only Caribbean country that has a railway.",
        " The biggest pyramid in the world is not in Egypt but in… Mexico. It is called Cholula and is currently covered in grass",
        "All the gondolas in Venice must be black unless they are the property of a high-ranked official.",
        "The name of Canada comes from the St. Lawrence Iroquoian word kanata or canada, meaning village or settlement.",
        " The Transsiberian Railway in Russia crosses 3901 bridges along its way.",
        " The Philippines Archipelago consists of 7107 islands",
                "17. Around 90% of the world population lives in the northern hemisphere",
        "Until 2002 there was an agreement between Monaco and France that if the principality doesn’t have a male heir, Monaco would lose its independence.",
        "It’s forbidden for airplanes to fly over the Taj Mahal.",
        " Mexico City sinks 4-6 inches (10-15 cm) a year because it was built over a lake. The city has sunk around 32 feet/10 m in the last 60 years.",
        "The first city to reach 1 million inhabitants was Rome in 133 BC. London reached the line in 1810, New York – in 1875. Nowadays more than 300 cities in the world have more than a million inhabitants.",
        "Amman – the capital of Jordan, used to be called Philadelphia.",
        " If a man gives a woman a compliment in Togo, he should marry her.",
        " Until almost the end of the 80’s there was not a single phone in Bhutan.",
        "On the 18th of February 1979 it was snowing in the Sahara."};


    public String getFacts(){
        String fact="";
        Random rand=new Random();
        int randLength=rand.nextInt(funFact.length);
        fact=funFact[randLength];
        return fact;
    }
}