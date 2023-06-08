package lesson10.key_word_this;

public class ClassConstructor {
    int x;
    String string;
    String text;
    boolean toBe;

    public ClassConstructor(int x, String string) {
        this.string = string;
        this.x = x;
    }

    public ClassConstructor(int x, String text, String string, boolean toBe){
        this(x, string);
        this.text = text;
        this.toBe = toBe;
    }

    @Override
    public String toString() {
        return "ClassConstructor{" +
                "x=" + x +
                ", string='" + string + '\'' +
                ", text='" + text + '\'' +
                ", toBe=" + toBe +
                '}';
    }

    public ClassConstructor(){
        this(233,"Strintd","text",true);
    }
}
