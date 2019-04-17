import { Note } from './note';

export class User {
    id: number;
    birthday: Date;
    name: string;
    avatar: string;
    bio: string;

    notes: Note[] = [];
}
 