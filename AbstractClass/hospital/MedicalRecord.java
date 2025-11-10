package hospital;

import java.util.ArrayList;
import java.util.List;

public interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}
