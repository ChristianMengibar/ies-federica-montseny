package org.iesfm.library;

import java.util.Objects;

public class BookLend {
    private String memberNIF;
    private int isbn;
    private String lendDate;
    private String retrieveDate;

    public BookLend(String memberNIF, int isbn, String lendDate, String retrieveDate) {
        this.memberNIF = memberNIF;
        this.isbn = isbn;
        this.lendDate = lendDate;
        this.retrieveDate = retrieveDate;
    }

    public String getMemberNIF() {
        return memberNIF;
    }

    public void setMemberNIF(String memberNIF) {
        this.memberNIF = memberNIF;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getRetrieveDate() {
        return retrieveDate;
    }

    public void setRetrieveDate(String retrieveDate) {
        this.retrieveDate = retrieveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return isbn == bookLend.isbn && Objects.equals(memberNIF, bookLend.memberNIF) && Objects.equals(lendDate, bookLend.lendDate) && Objects.equals(retrieveDate, bookLend.retrieveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNIF, isbn, lendDate, retrieveDate);
    }

    @Override
    public String toString() {
        return "BookLend{" +
                "memberNIF='" + memberNIF + '\'' +
                ", isbn=" + isbn +
                ", lendDate='" + lendDate + '\'' +
                ", retrieveDate='" + retrieveDate + '\'' +
                '}';
    }
}
