package ru.rvsproject.demobrowsergame.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.rvsproject.demobrowsergame.models.Player;
import ru.rvsproject.demobrowsergame.services.HibernateSessionFactoryUtil;

public class UserInteraction {

    /**
     * Пользователь регистрируется в сервисе
     * @return true в случае, если транзакция была проведена успешно или false, в случае неудачи
     */
    public Boolean registration(Player player) {
        player.setPassword(new BCryptPasswordEncoder().encode(player.getPassword())); // шифруем пароль
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(player);
        transaction.commit();
        session.close();
        return session.getTransaction().getStatus() == TransactionStatus.COMMITTED;
    }

    /**
     * Пользователь отправляет сообщение на главной странице
     */
    public Boolean sendMessageForTeam() {
        return true;
    }
}
