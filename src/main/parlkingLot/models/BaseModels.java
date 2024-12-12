package main.parlkingLot.models;

import java.time.LocalDateTime;

public abstract class BaseModels {
    private int id;
    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;

    public BaseModels(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
