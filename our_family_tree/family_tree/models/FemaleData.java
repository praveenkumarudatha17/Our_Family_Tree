package family_tree.models;

public class FemaleData {

    private String name;
    private String daughter;
    private String mother;
    private String sister;
    private String wife;
    private boolean isMarried;
    private String husband;
    private String grandMother;

    private FemaleData(FemaleDataBuilder data) {
        this.name = data.name;
        this.daughter = data.daughter;
        this.mother = data.mother;
        this.sister = data.sister;
        this.wife = data.wife;
        this.isMarried = data.isMarried;
        this.husband = data.husband;
        this.grandMother = data.grandMother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaughter() {
        return daughter;
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSister() {
        return sister;
    }

    public void setSister(String sister) {
        this.sister = sister;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }

    public String getGrandMother() {
        return grandMother;
    }

    public void setGrandMother(String grandMother) {
        this.grandMother = grandMother;
    }

    public FemaleDataBuilder getBuilder(){
        return new FemaleDataBuilder();
    }

    public static class FemaleDataBuilder {
        private String name;
        private String daughter = null;
        private String mother = null;
        private String sister = null;
        private String wife = null;
        private boolean isMarried = false;
        private String husband = null;
        private String grandMother = null;

        public FemaleDataBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public FemaleDataBuilder setDaughter(String daughter) {
            this.daughter = daughter;
            return this;
        }

        public FemaleDataBuilder setMother(String mother) {
            this.mother = mother;
            return this;
        }

        public FemaleDataBuilder setSister(String sister) {
            this.sister = sister;
            return this;
        }

        public FemaleDataBuilder setWife(String wife) {
            this.wife = wife;
            return this;
        }

        public FemaleDataBuilder setMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public FemaleDataBuilder setHusband(String husband) {
            this.husband = husband;
            return this;
        }

        public FemaleDataBuilder setGrandMother(String grandMother) {
            this.grandMother = grandMother;
            return this;
        }

        public FemaleData build(){
            return new FemaleData(this);
        }
    }
    
}
