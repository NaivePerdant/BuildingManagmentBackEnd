-- 创建分配记录表 (allocations)
CREATE TABLE allocations (
                             id INT PRIMARY KEY AUTO_INCREMENT,
                             room_id INT,
                             allocated_to VARCHAR(255),
                             allocation_time DATETIME,
                             status ENUM('allocated', 'deallocated'),
                             notes TEXT
);