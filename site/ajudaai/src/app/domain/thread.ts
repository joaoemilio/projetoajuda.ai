import { User } from './user';

export interface Thread {
    id: number;
    descricao: string;
    idForum: number;
    user: User;
  }