public enum Signal implements Work {
    RED("Stop") {
        @Override
        public void change(){
                System.out.println("will change to YELLOW");
            }
        },
    GREEN("Go"){
        @Override
        public void change(){
            System.out.println("will change to YELLOW");
        }
    },
    YELLOW("Wait"){
        @Override
        public void change(){
            System.out.println("will change to RED");
        }
    };

    private String color;
    Signal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
