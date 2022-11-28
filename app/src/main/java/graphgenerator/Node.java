package graphgenerator;

import java.util.ArrayList;

import structures.DataStructure;

public class Node {

    public Node(){

    }

    public Node(String n) {
        methodName = n;
    }

    public Node(String n, DataStructure<String> ds){
        methodName = n;
        variables = new ArrayList<>();
        dataStructure = ds;

    }

    public ArrayList<String> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<String> variables) {
        this.variables = variables;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public DataStructure<String> getDs() {
        return dataStructure;
    }

    public void setDs(DataStructure<String> ds) {
        this.dataStructure = ds;
    }

    @Override
    public String toString() {
        return " Node{" +
                "methodName='" + methodName + '\'' +
                ", variables=" + variables +
                ", dataStructure=" + dataStructure.getClass().getName() +
                "} ";
    }

    private String methodName;
    private ArrayList<String> variables;
    private DataStructure<String> dataStructure;

}


