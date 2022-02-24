package org.zerock.ntf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ntf.entity.Guestbook;

public interface GuestBookRepository extends JpaRepository<Guestbook, Long> {

}
