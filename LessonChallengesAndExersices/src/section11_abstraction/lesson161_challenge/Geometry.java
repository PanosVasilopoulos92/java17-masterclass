package section11_abstraction.lesson161_challenge;

public enum Geometry {
    LINE,
    POINT,
    POLYGON,
    STAR;

    public void printValues(){
//        System.out.println(Arrays.toString(values()));
        System.out.println(Geometry.LINE);

        for (Geometry item : values()){
            System.out.println(ordinal());
        }
    }
}
