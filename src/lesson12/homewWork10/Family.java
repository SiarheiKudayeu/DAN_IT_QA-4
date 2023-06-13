package lesson12.homewWork10;

public class Family {
    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    private Human mother;
    private Human father;
    private Human[] children;

    public Family(Human mother, Human father, String familyName) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.familyName = familyName;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public void addChild(Human newChild) {
        newChild.setFamily(this);
        Human[] newArray = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = newChild;
        children = newArray;
    }

    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human[] newArray = new Human[children.length - 1];
        int k = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
            children[i] = newArray[k];
            k++;
        }
        children = newArray;
    }
}
