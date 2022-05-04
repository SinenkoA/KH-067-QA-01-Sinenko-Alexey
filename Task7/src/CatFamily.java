public interface CatFamily {

    // method CatVoice
    default void CatVoice() {
        System.out.println(" voice");
    }

    // method CatSleeping
    void CatSleeping();

}
