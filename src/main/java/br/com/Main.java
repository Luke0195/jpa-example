package br.com;

import br.com.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.getEntityManager();
    }
}