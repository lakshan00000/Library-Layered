package library.ijse.dao;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {}

    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type){
        switch(type){
            case Books:
               return null;
            default:
               return null;
        }
    }

    public enum DaoTypes{
        Books,Member,BookCategory,BorrowigTransaction;
    }

}
