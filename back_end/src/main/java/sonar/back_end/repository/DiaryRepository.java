package sonar.back_end.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sonar.back_end.entity.DiaryEntity;

public interface DiaryRepository extends JpaRepository<DiaryEntity, Long> {
}