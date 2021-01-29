package org.iesfm.library;

public interface ILibrary {
    void showBooks();

    void showBooks(String genre);

    void showMember();

    void showMembers(int cp);

    void showMemberLends(String nif);

    void showMemberLends(int numMember);

    boolean memberHasLend(int numMember, int isbn);
}
