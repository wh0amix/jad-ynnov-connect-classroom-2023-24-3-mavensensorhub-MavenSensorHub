package com.jad.ui.api;
import com.jad.data.api.IDataManager;
public interface IApplication {
    void manageOrder(UserAction userAction);
    IDataManager getDataManager();
}
