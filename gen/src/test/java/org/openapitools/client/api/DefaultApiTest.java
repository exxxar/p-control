/*
 * API системы \"Народный контроль\"
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserForm;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Список пользователей
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersGetTest() throws ApiException {
        Long page = null;
        Long size = null;
        Object response = api.usersGet(page, size);

        // TODO: test validations
    }
    
    /**
     * Создаем пользователя
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersPostTest() throws ApiException {
        UserForm userForm = null;
        User response = api.usersPost(userForm);

        // TODO: test validations
    }
    
    /**
     * Удаляем пользователя по идентификатору
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUserIdDeleteTest() throws ApiException {
        Long userId = null;
        User response = api.usersUserIdDelete(userId);

        // TODO: test validations
    }
    
    /**
     * Находим пользователя по идентификатору
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUserIdGetTest() throws ApiException {
        Long userId = null;
        User response = api.usersUserIdGet(userId);

        // TODO: test validations
    }
    
    /**
     * Обновляем пользователя по идентификатору
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUserIdPutTest() throws ApiException {
        Long userId = null;
        UserForm userForm = null;
        User response = api.usersUserIdPut(userId, userForm);

        // TODO: test validations
    }
    
}
