package family_tree.models;

public class MaleData {

    private String name;
    private String son;
    private String father;
    private String brother;
    private String husband;
    private boolean isMarried;
    private String wife;
    private String grandFather;

    private MaleData(MaleDataBuilder data) {
        this.name = data.name;
        this.son = data.son;
        this.father = data.father;
        this.brother = data.brother;
        this.husband = data.husband;
        this.isMarried = data.isMarried;
        this.wife = data.wife;
        this.grandFather = data.grandFather;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSon() {
        return son;
    }
    public void setSon(String son) {
        this.son = son;
    }
    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }
    public String getBrother() {
        return brother;
    }
    public void setBrother(String brother) {
        this.brother = brother;
    }
    public String getHusband() {
        return husband;
    }
    public void setHusband(String husband) {
        this.husband = husband;
    }
    public boolean isMarried() {
        return isMarried;
    }
    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    public String getWife() {
        return wife;
    }
    public void setWife(String wife) {
        this.wife = wife;
    }
    public String getGrandFather() {
        return grandFather;
    }
    public void setGrandFather(String grandFather) {
        this.grandFather = grandFather;
    }

    public MaleDataBuilder getBuilder(){
        return new MaleDataBuilder();
    }

    public static class MaleDataBuilder {
        private String name;
        private String son = null;
        private String father = null;
        private String brother = null;
        private String husband = null;
        private boolean isMarried = false;
        private String wife = null;
        private String grandFather = null;

        public MaleDataBuilder setName(String name) {
            this.name = name;
            return this;
        }


        public MaleDataBuilder setSon(String son) {
            this.son = son;
            return this;
        }


        public MaleDataBuilder setFather(String father) {
            this.father = father;
            return this;
        }


        public MaleDataBuilder setBrother(String brother) {
            this.brother = brother;
            return this;
        }


        public MaleDataBuilder setHusband(String husband) {
            this.husband = husband;
            return this;
        }


        public MaleDataBuilder setMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }


        public MaleDataBuilder setWife(String wife) {
            this.wife = wife;
            return this;
        }


        public MaleDataBuilder setGrandFather(String grandFather) {
            this.grandFather = grandFather;
            return this;
        }
        
        public MaleData build(){
            return new MaleData(this);
        }
    }
    
}
