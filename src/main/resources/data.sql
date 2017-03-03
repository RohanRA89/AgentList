INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-1, 8, 'Ethan Hunt', 'Tom Cruise');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-2, 9, 'Jim Phelps', 'Jon Voight');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-3, 5, 'Claire Phelps', 'Emmanuelle Beart');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-4, 10, 'Eugene Kittridge', 'Henry Czerny');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-5, 4, 'Franz Krieger', 'Jean Reno');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-6, 4, 'Luther Stickell', 'Ving Rhames');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-7, 5, 'Sarah Davies', 'Kristin Scott Thomas');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-8, 4, 'Max RotGrab', 'Vanessa Redgrave');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-9, 5, 'Hannah Williams', 'Ingeborga Dapkūnaitė');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-10, 6, 'Jack Harmon', 'Emilio Estevez');
INSERT INTO public.agent_list (id, access_level, cover_name, real_name) VALUES (-11, 9, 'Frank Barnes', 'Dale Dye');

INSERT INTO public.agent_permissions (id, key, permission_name) VALUES (-12, 'PERM_ACCESS_FOUR', 'Access Level 4');
INSERT INTO public.agent_permissions (id, key, permission_name) VALUES (-13, 'PERM_ACCESS_FIVE', 'Access Level 5');
INSERT INTO public.agent_permissions (id, key, permission_name) VALUES (-14, 'PERM_ACCESS_SIX', 'Access Level 6');
INSERT INTO public.agent_permissions (id, key, permission_name) VALUES (-15, 'PERM_ACCESS_EIGHT', 'Access Level 8');
INSERT INTO public.agent_permissions (id, key, permission_name) VALUES (-16, 'PERM_ACCESS_NINE', 'Access Level 9');
INSERT INTO public.agent_permissions (id, key, permission_name) VALUES (-17, 'PERM_ACCESS_TEN', 'Access Level 10');

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-1, -15);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-1, -14);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-1, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-1, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-2, -16);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-2, -15);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-2, -14);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-2, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-2, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-3, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-3, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-4, -17);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-4, -16);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-4, -15);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-4, -14);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-4, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-4, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-5, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-6, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-7, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-7, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-8, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-9, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-9, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-10, -14);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-10, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-10, -12);

INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-11, -16);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-11, -15);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-11, -14);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-11, -13);
INSERT INTO public.agent_list_access_permission (agent_list_id, access_permission_id) VALUES (-11, -12);