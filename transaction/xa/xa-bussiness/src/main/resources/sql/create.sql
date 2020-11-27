


DROP DATABASE IF EXISTS `transaction_xa_pay`;
CREATE DATABASE IF NOT EXISTS `transaction_xa_pay` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use `transaction_xa_pay`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pay
-- ----------------------------
DROP TABLE IF EXISTS `pay`;
CREATE TABLE `pay`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` double NULL DEFAULT 0,
  `user_id` int(11) NULL DEFAULT 0,
  `create_time` bigint(20) NULL DEFAULT NULL,
  `update_time` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;



DROP DATABASE IF EXISTS `transaction_xa_account`;
CREATE DATABASE IF NOT EXISTS `transaction_xa_account` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use `transaction_xa_account`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `money` double NOT NULL DEFAULT 0,
  `create_time` bigint(20) NULL DEFAULT 0,
  `update_time` bigint(20) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
