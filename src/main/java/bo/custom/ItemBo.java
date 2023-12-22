package bo.custom;

import dto.ItemDto;
import java.sql.SQLException;
import java.util.List;

public interface ItemBo<T> {
    boolean saveItem(T dto) throws SQLException, ClassNotFoundException;
    boolean updateItem(T dto) throws SQLException, ClassNotFoundException;
    boolean deleteItem(String code) throws SQLException, ClassNotFoundException;
    List<ItemDto> allItems() throws SQLException, ClassNotFoundException;
    ItemDto getItem(String code);
}