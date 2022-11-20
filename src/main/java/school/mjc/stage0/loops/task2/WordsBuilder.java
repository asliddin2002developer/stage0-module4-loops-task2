package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        int counter = 0;
        String res = "";
        while (counter < length){
            res += chars[counter];
            counter++;
        }
        System.out.println(res);
    }
}
