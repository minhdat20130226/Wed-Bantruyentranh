package cdweb.sellstories.sellstories.repository;

import cdweb.sellstories.sellstories.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles,Long> {
}
