package simple_formal_deep_concepts;

import java.util.Objects;

public class Drawing extends Art{
    private int lineLen;
    private int linePos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drawing drawing = (Drawing) o;
        return lineLen == drawing.lineLen && linePos == drawing.linePos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineLen, linePos);
    }

    Drawing(int lineLen, int linePos){
        this.lineLen = lineLen;
        this.linePos = linePos;
    }

    public static void main(String[] args) {
        Drawing drawing = new Drawing(12, 0);
        Drawing drawing1 = new Drawing(12, 0);

        System.out.println(drawing.equals(drawing1));
        System.out.println(drawing == drawing1);

        Art art = new Art();

        Art art1 = null;
        System.out.println(art1 instanceof Art);
    }
}
