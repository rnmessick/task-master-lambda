package lambda.dynamo;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class HistoryObj {
    String time;
    String action;

    public HistoryObj(){}

    public HistoryObj(String time, String action){
        this.time = time;
        this.action = action;
    }

    public HistoryObj(String status) {
        this.action = status;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public String toString() {
        return String.format("%s @ %s", this.getAction(), this.getTime());
    }
}