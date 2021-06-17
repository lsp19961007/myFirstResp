package com.bjpowernode.dao;

import com.bjpowernode.domain.Product;
import com.bjpowernode.domain.Type;

import java.util.List;

public interface ProductDao {
    List<Product> queryProduct(Product product);

    int addProduct(Product product);

    int deleteProduct(String id);

    int editProduct(Product product);

    Product getProduct(String id);

    List<Type> queryTypeList();

    int deleteType(String id);

    int addType(Type type);

    int editType(Type type);

    String queryType(String id);
}
