package ex02;

// Another Adapter class that adapts AnotherAdaptee to the Target interface
class AnotherAdapter implements Target {
    private AnotherAdaptee anotherAdaptee;

    public AnotherAdapter(AnotherAdaptee anotherAdaptee) {
        this.anotherAdaptee = anotherAdaptee;
    }

    @Override
    public void request() {
        anotherAdaptee.anotherSpecificRequest();
    }
}
