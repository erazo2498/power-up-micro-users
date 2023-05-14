
INSERT INTO `role` (`id`, `description`, `name`) VALUES (1, 'ROLE_ADMIN', 'ROLE_ADMIN');
INSERT INTO `role` (`id`, `description`, `name`) VALUES (2, 'ROLE_OWNER', 'ROLE_OWNER');
INSERT INTO `role` (`id`, `description`, `name`) VALUES (3, 'ROLE_EMPLOYER', 'ROLE_EMPLOYER');
INSERT INTO `role` (`id`, `description`, `name`) VALUES (4, 'ROLE_CUSTOMER', 'ROLE_CUSTOMER');

INSERT INTO `user` (
    `name`,
    `surname`,
    `dni_number`,
    `phone`,
    `birthdate`,
    `email`,
    `password`,
    `id_role`
  )
VALUES
  (
    'name',
    'surname',
    '12345678',
    '3132223331',
    '2000-03-24',
    'email@some.com',
    '$2a$10$IU7.4hO7OI/05Bv3KrO0Sebuihfqyj0AZPnO3vCCDUsB5QWNvhiP6',
    '1'
  );
