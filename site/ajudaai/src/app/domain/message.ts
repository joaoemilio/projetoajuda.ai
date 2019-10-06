import { User } from './user';

export interface Message {
    id: number;
    message: string;
    threadId: string;
    email: string;
  }