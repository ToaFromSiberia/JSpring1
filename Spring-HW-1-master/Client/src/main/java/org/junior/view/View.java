package org.junior.view;

import org.junior.chat.common.*;

import org.junior.view.listeners.ClientEventListener;


public interface View {

    /**
     * Вывод в поле истории сообщения
     */
    void showMessage(String message);

    /**
     * Установка статуса соединения (чтобы GUI это отобразило для пользователя)
     */
    void setConnectStatus(ConnectStatus status);

    /**
     * Установка и чтение данных о пользователе
     */
    void setAccount(Account account);
    Account getAccount();

    /**
     * Установка слушателей для контролов ClientView
     */
    <T extends ClientEventListener> void addListener(Class<T> t, T l);

    /**
     * Удаление слушателей для контролов ClientView
     */
    <T extends ClientEventListener> void removeListeners(Class<T> t, T l);


}
