
INSERT INTO `role` (`id`, `description`, `name`) VALUES ('1', 'ROLE_ADMIN', 'ROLE_ADMIN');

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
    '$2a$10$GlsGSNhkbVon6ZOSNMptOu5RikedRzlCAhMa7YpwvUSS0c88WT99S',
    '1'
  );
