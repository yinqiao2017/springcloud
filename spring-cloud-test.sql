/*
Source Server         : localhost
Source Host           : localhost:3306
Source Database       : springcloud
source username       : root
source password       : root

Target Server Type    : MYSQL
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(255) DEFAULT NULL,
  `stock` int(18) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

insert into t_goods( goodsName, stock, price) values("百年孤独",100, 100);
insert into t_goods(goodsName, stock, price) values( "西游记",100, 150);
insert into t_goods( goodsName, stock, price) values( "三国演义",100, 200);
insert into t_goods( goodsName, stock, price) values( "红楼梦",100, 300);
insert into t_goods( goodsName, stock, price) values( "水浒传",100, 350);


